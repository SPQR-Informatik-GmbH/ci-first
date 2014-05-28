package de.spqrinfo.jee.cifirst.web;

import javax.enterprise.inject.Model;

@Model
public class IndexBacking {

    public String getSomeMessage() {
        return "Hello from IndexBacking Bean";
    }
}
