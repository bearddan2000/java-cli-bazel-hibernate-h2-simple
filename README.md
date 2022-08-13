# java-cli-bazel-hibernate-h2-simple

## Description
Creates a small database table
called `dog` and populates with
hql.

## Tech stack
- java
- bazel
  - hibernate
  - hql
  - log4j
  - h2 driver

## Docker stack
- l.gcr.io/google/bazel:latest

## To run
`sudo ./install.sh -u`

## To stop
`sudo ./install.sh -d`
## For help
`sudo ./install.sh -h`

## Credit
- [Hibernate config based on](https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/An-example-hibernatecfgxml-for-MySQL-8-and-Hibernate-5)
- [Hibernate code based on](https://github.com/lokeshgupta1981/hibernate/tree/master/hibernate-hello-world)
