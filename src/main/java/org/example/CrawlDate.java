package org.example;

import java.time.LocalDateTime;

public class CrawlDate {
    private LocalDateTime lastCrawlDateTime;

    public LocalDateTime getLastCrawlDateTime() {
        return lastCrawlDateTime;
    }

    public void setLastCrawlDateTime(LocalDateTime lastCrawlDateTime) {
        this.lastCrawlDateTime = lastCrawlDateTime;
    }

    public CrawlDate(LocalDateTime lastCrawlDateTime) {
        this.lastCrawlDateTime = lastCrawlDateTime;
    }
}
