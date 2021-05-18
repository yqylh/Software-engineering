#!/usr/bin/env python3
# -*- coding: utf-8 -*-
from collections import deque

__author__ = 'mejty'


class CircularShift:
    def shifted_lines(self, lines):
        for line in lines:
            words = line.split(" ")
            dec = deque(words)
            for i in range(0, len(dec)):
                dec.rotate()
                yield " ".join(dec)
