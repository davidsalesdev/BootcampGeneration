����   < X  
Exercicio4  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LExercicio4; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Entre com o valor de A: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , Entre com o valor de B:  . Entre com o valor de c: @       
 2 4 3 java/lang/Math 5 6 pow (DD)D 8 java/lang/StringBuilder : O valor de D é: 
 7 <  &
 7 > ? @ append (D)Ljava/lang/StringBuilder;
 7 B C D toString ()Ljava/lang/String;
 " F G H printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
  J K  close args [Ljava/lang/String; A D B C R S leia Ljava/util/Scanner; 
SourceFile Exercicio4.java !               /     *� �    
                    	           ~� Y� � :� � !� '�H� +� !� '�J� -� !� '�9')c /� 19	)c /� 19	c /o9� � 7Y9� ;� =� A� � EW� I�    
   6           #  *  2  :  E  Q  \  x   } "    R    ~ L M    c N O  * T P O  : D Q O  \ " O O  E 9 R O 	 Q - S O   r T U   V    W