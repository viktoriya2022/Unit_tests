from unittest.mock import Mock

import pytest as pytest

# import pytest
from Tasks import Tasks


def text_average():
    numbers = [10, 20, 30, 40, 50]
    assert Tasks.find_average(numbers) == 30


def text_average_null():
    numbers = []
    assert Tasks.find_average(numbers) == 0


def text_average_one():
    numbers = [2]
    assert Tasks.find_average(numbers) == 2


# def find_average(numbers):
#     if not numbers:
#         return 0
#     return sum(numbers) / len(numbers)

# def test_find_average():
#     assert Tasks.find_average([10, 20, 30, 40, 50]) == 30
#     assert Tasks.find_average([]) == 0
#     assert Tasks.find_average([5]) == 5