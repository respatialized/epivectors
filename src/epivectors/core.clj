(ns epivectors.core)

; why use a defrecord and not a map?
; for validation
(defrecord position_cartesian [x y])
(defrecord orientation_cartesian [x y])
(defrecord magnitude [m])
