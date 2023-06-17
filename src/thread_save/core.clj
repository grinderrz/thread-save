(ns thread-save.core)

(defmacro ->>save
  [n expr]
  `(do
     (defonce ~n ~expr)
     ~n))

(defmacro ->save
  [expr n]
  `(do
     (defonce ~n ~expr)
     ~n))

(defmacro ->also
  [expr f]
  `(let [result# ~expr]
     (~f result#)
     result#))

(defmacro ->>also
  [f expr]
  `(let [result# ~expr]
     (~f result#)
     result#))
