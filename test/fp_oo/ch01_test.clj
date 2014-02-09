(ns fp-oo.ch01-test
  (:require [clojure.test :refer :all]
            [fp-oo.ch01 :refer :all]))


(deftest exercise-1-test
  (testing "returns the second element"
    (is (= (exercise-1 [0 1 2 3]) 1))))

(deftest exercise-2-1-test
  (testing "returns the third element"
    (is (= (exercise-2-1 [0 1 2 3]) 2))))

(deftest exercise-2-2-test
  (testing "returns the third element"
    (is (= (exercise-2-2 [0 1 2 3]) 2))))

(deftest add-squares-test
  (testing "add-squares"
    (is (= (add-squares 1 2 5) 30))))

(deftest bizarre-factorial-test
  (testing "factorial"
    (is (= (bizarre-factorial 5) 120))))

(deftest bizarre-factorial-2-test
  (testing "factorial"
    (is (= (bizarre-factorial-2 5) 120))))

(deftest factorial-recursion-test
  (testing "factorial"
    (is (= (factorial-recursion 5) 120))))

(deftest prefix-of?-test
  (testing "prefix-of?"
    (is (= (prefix-of? [1 2] [1 2 3 4]) true))
    (is (= (prefix-of? '(2 3) [1 2 3 4]) false))
    (is (= (prefix-of? '(1 2) [1 2 3 4]) true))))

(deftest tails-test
  (testing "tails"
    (is (= (tails '(1 2 3 4)) [[1 2 3 4] [2 3 4] [3 4] [4] []]))))
