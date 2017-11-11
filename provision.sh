#!/bin/bash

apt-get update
apt-get -y install tree

apt-get install -y ntp
service ntp start
timedatectl set-ntp true
