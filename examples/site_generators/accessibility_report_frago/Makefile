all: build

serve:
	hugo serve

build:
	HUGO_ENV="production" hugo --buildFuture --gc --minify --cleanDestinationDir
