����   < Q  
Exercicio5  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LExercicio5; main ([Ljava/lang/String;)V@       @      @        java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
      (Ljava/io/InputStream;)V	  " # $ out Ljava/io/PrintStream; & Entre com o valor da nota 1: 
 ( * ) java/io/PrintStream + , println (Ljava/lang/String;)V
  . / 0 nextInt ()I 2 Entre com o valor da nota 2:  4 Entre com o valor da nota 3:  6 java/lang/StringBuilder 8 O resultado é: 
 5 :  ,
 5 < = > append (D)Ljava/lang/StringBuilder;
 5 @ A B toString ()Ljava/lang/String; args [Ljava/lang/String; nota1 D nota2 nota3 peso1 peso2 peso3 mediaP leia Ljava/util/Scanner; 
SourceFile Exercicio5.java !               /     *� �    
                    	           { 9 9	 9� Y� � :� !%� '� -�H� !1� '� -�J� !3� '� -�9'k)	kck	ccoc9� !� 5Y7� 9� ;� ?� '�    
   .         #  *  2  9  A  I  c  z      \ 	   { C D   * Q E F  9 B G F  I 2 H F   v I F  
 q J F 	  l K F  c  L F   ` M N   O    P