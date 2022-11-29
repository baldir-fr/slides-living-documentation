all: load-dependencies generate-slides

load-dependencies:
	cd docs;npm install;

generate-slides:
	cd docs;npx asciidoctor-revealjs index.adoc -o index.html