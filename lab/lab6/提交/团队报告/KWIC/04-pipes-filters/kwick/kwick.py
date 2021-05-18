#!/usr/bin/env python3
# -*- coding: utf-8 -*-
from input import Input
from circular_shift import CircularShift
from alphabetizer import Alphabetizer
from output import Output

__author__ = 'mejty'

input = Input("../input.txt")
circular_shift = CircularShift()
alphabetizer = Alphabetizer()
output = Output("../output.txt")

output.save_to_file(alphabetizer.sorted_lines(circular_shift.shifted_lines(input.lines())))
