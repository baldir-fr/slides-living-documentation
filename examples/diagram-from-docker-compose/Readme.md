# Generate diagram from docker-compose file

```shell
make
```

or 

```shell
docker run --rm -it --name dcv -v $(pwd):/input pmsipilot/docker-compose-viz render -m image docker-compose.yml
```
