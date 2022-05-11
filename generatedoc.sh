#!/usr/bin/env bash
cd docs
npm install
npx asciidoctor-revealjs index.adoc -o index.html
cd ..
