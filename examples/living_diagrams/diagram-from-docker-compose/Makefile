all: clean prepare generate-png generate-dot

clean:
	rm -rf output

prepare:
	mkdir -p output

generate-png:
	$(shell docker run --rm -it --name dcv -v $$(pwd):/input pmsipilot/docker-compose-viz render -m image docker-compose.yml -o output/docker-compose.png)

generate-dot:
	$(shell docker run --rm -it --name dcv -v $$(pwd):/input pmsipilot/docker-compose-viz render -m dot docker-compose.yml -o output/docker-compose.dot)
