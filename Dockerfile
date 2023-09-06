FROM ubuntu:latest
LABEL authors="eleis"

ENTRYPOINT ["top", "-b"]