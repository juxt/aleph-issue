(ns aleph-issue.play
  (:require
   [aleph.http :as http]
   [manifold.stream :as ms]))

(defn handler [req]
  {:status 200
   :headers {"content-type" "text/plain"}
   :body "Hi!\r\n"})

(def server (http/start-server handler {:port 8080}))

(.close server)
