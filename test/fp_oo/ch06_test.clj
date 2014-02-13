(ns fp-oo.ch06-test
  (:require [clojure.test :refer :all]
            [fp-oo.ch06 :refer :all]))


(deftest factorial-test
  (testing "factorial"
    (is (= (factorial 0) 1))
    (is (= (factorial 1) 1))
    (is (= (factorial 5) 120))))


;; (fact
;;   (recursive-function [] 0) => 0
;;   (recursive-function [1 2 3 4] 0) => 10)

(deftest add-seq-test
  (testing "add-seq"
    (is (= (add-seq []) 0))
    (is (= (add-seq [1 2 3 4]) 10))))

(deftest add-seq-2-test
  (testing "add-seq-2"
    (is (= (add-seq-2 []) 0))
    (is (= (add-seq-2 [1 2 3 4]) 10))))

(deftest add-seq-3-test
  (testing "add-seq-3"
    (is (= (add-seq-3 []) 0))
    (is (= (add-seq-3 [1 2 3 4]) 10))))
