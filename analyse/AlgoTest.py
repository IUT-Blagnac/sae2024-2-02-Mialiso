# test_compression.py

import unittest
from compression import RLE, RLE_rec, unRLE, unRLE_rec

class TestCompressionAlgorithms(unittest.TestCase):

    def test_RLE(self):
        self.assertEqual(RLE(""), "")
        self.assertEqual(RLE("A"), "1A")
        self.assertEqual(RLE("AAA"), "3A")
        self.assertEqual(RLE("AAAAAAAAA"), "9A")
        self.assertEqual(RLE("AAAAAAAAAA"), "9A1A")
        self.assertEqual(RLE("AAABBB"), "3A3B")
        self.assertEqual(RLE("AAABBBAA"), "3A3B2A")
        self.assertEqual(RLE("AAABBBCCCAAA"), "3A3B3C3A")

    def test_RLE_rec(self):
        self.assertEqual(RLE_rec("AAABBBCCCAAA", 0), "AAABBBCCCAAA")
        self.assertEqual(RLE_rec("AAABBBCCCAAA", 1), "3A3B3C3A")
        self.assertEqual(RLE_rec("AAABBBCCCAAA", 2), "132A132B132C132A")
        self.assertEqual(RLE_rec("AAABBBCCCAAA", 3), "111131132111131132111131132111131132")

    def test_unRLE(self):
        self.assertEqual(unRLE(""), "")
        self.assertEqual(unRLE("1A"), "A")
        self.assertEqual(unRLE("3A"), "AAA")
        self.assertEqual(unRLE("9A"), "AAAAAAAAA")
        self.assertEqual(unRLE("9A1A"), "AAAAAAAAAA")
        self.assertEqual(unRLE("3A3B"), "AAABBB")
        self.assertEqual(unRLE("3A3B2A"), "AAABBBAA")
        self.assertEqual(unRLE("3A3B3C3A"), "AAABBBCCCAAA")

    def test_unRLE_rec(self):
        self.assertEqual(unRLE_rec("3A3B3C3A", 0), "3A3B3C3A")
        self.assertEqual(unRLE_rec("3A3B3C3A", 1), "AAABBBCCCAAA")
        self.assertEqual(unRLE_rec("132A132B132C132A", 2), "AAABBBCCCAAA")
        self.assertEqual(unRLE_rec("111131132111131132111131132111131132", 3), "AAABBBCCCAAA")

if __name__ == '__main__':
    unittest.main()
