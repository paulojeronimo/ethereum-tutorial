#!/bin/bash

apt-get update
apt-get -y install tree python-minimal

apt-get install -y ntp
service ntp start
timedatectl set-ntp true
