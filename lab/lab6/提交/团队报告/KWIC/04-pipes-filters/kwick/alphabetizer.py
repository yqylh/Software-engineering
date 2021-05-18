#!/usr/bin/env python3
# -*- coding: utf-8 -*-

__author__ = 'mejty'


class Alphabetizer:
    def sorted_lines(self, shifted_lines):
        yield from sorted(shifted_lines)
