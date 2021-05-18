# KWIC: Pipes and filters

This implementation uses pipe and filters architecture. It implemented in Python and required version 3.3 or above.
Pipes are repented by Python's generators.
There is main file [KWIC](https://github.com/klimesf/kwic/blob/master/04-pipes-filters/kwick/kwick.py)
with connect together filters.

The program works with [input text from the article](https://github.com/klimesf/kwic/blob/master/04-pipes-filters/input.txt)
and produces [alphabetically sorted circular shifts of each line](https://github.com/klimesf/kwic/blob/master/04-pipes-filters/output.txt).

## Filters 
 * [Input](https://github.com/klimesf/kwic/blob/master/04-pipes-filters/kwick/input.py)
 * [CircularShift](https://github.com/klimesf/kwic/blob/master/04-pipes-filters/kwick/circular_shift.py)
 * [Alphabetizer](https://github.com/klimesf/kwic/blob/master/04-pipes-filters/kwick/alphabetizer.py) (this one have to wait for all data before produce output)
 * [Output](https://github.com/klimesf/kwic/blob/master/04-pipes-filters/kwick/output.py)
