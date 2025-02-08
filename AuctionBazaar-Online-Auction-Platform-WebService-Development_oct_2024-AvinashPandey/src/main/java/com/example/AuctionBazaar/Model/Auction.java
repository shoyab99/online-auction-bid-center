package com.example.AuctionBazaar.Model;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "auctions_vicky")
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auctionId;

    private Long ownerId;
    private Long categoryId;
    private String title;
    private String description;
    private BigDecimal startPrice;
    private BigDecimal currentPrice;
    private Timestamp startTime;
    private Timestamp endTime;

    @Enumerated(EnumType.STRING)  // Ensure this annotation remains here
    private AuctionStatus status; // Use the custom AuctionStatus enum here

    private Long winnerUserId;

    public Long getAuctionId() {
		return auctionId;
	}

	public void setAuctionId(Long auctionId) {
		this.auctionId = auctionId;
	}

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public BigDecimal getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(BigDecimal startPrice) {
		this.startPrice = startPrice;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public AuctionStatus getStatus() {
		return status;
	}

	public void setStatus(AuctionStatus status) {
		this.status = status;
	}

	public Long getWinnerUserId() {
		return winnerUserId;
	}

	public void setWinnerUserId(Long winnerUserId) {
		this.winnerUserId = winnerUserId;
	}
}

// Getters and Setters, etc.
