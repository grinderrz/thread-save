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
