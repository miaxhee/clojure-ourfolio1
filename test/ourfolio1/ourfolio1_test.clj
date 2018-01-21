(ns ourfolio1.ourfolio1-test
  (:require [clojure.test :refer :all]
            [ourfolio1.ourfolio1 :refer :all]))

(deftest test-serpent-talk
  (testing "Cries serpent! with a snake_case version of the input"
    (is (= "Serpent!  You said: hello_there"
	      (serpent-talk "hello there")))))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))
