all:
	javac -g ./*/*.java
clear:
	rm ./*/*.class
run:
	java main.Main
