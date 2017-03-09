all:
	javac -g ./*/*
clear:
	rm ./*/*.class
run:
	java main.Main
