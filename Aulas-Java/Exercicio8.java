����   < N  
exercicio8  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lexercicio8; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Entre com o custo de Fábrica: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * 
nextDouble ()D?���Q�?������� 0 java/lang/StringBuilder 2 Custo ao consumidor 
 / 4  &
 / 6 7 8 append (D)Ljava/lang/StringBuilder;
 / : ; < toString ()Ljava/lang/String;
 " > ? @ printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
  B C  close args [Ljava/lang/String; leia Ljava/util/Scanner; custoFabrica D custoConsumidor distribuidor 
SourceFile exercicio8.java !               /     *� �    
                    	       �     M� Y� � L� � !+� 'I(( +kc9 -kc9� � /Y1� 3� 5� 9� � =W+� A�    
   "           !  ,  H  L     4    M D E    B F G   5 H I  , ! J I  ! , K I   L    M