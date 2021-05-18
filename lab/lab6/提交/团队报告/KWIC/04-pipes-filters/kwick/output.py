#!/usr/bin/env python3
# -*- coding: utf-8 -*-

__author__ = 'mejty'


class Output:
    def __init__(self, filename):
        self.filename = filename

    def save_to_file(self, sorted_lines):
        with open(self.filename, "w") as file:
            for line in sorted_lines:
                file.write("{line}\n".format(line=line))
            file.close()
