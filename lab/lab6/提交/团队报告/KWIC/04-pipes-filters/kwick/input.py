#!/usr/bin/env python3
# -*- coding: utf-8 -*-

__author__ = 'mejty'


class Input:
    def __init__(self, filename):
        self.filename = filename

    def lines(self):
        with open(self.filename) as file:
            return [line.strip() for line in file]
