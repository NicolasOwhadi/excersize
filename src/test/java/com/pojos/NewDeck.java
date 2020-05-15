package com.pojos;

import com.google.gson.annotations.SerializedName;
/*
this is a POJO class for one of the end points
 */
public class NewDeck {
    @SerializedName("success")
    private boolean success;

    @SerializedName("deck_id")
    private String deckId;

    @SerializedName("shuffled")
    private boolean shuffled;

    @SerializedName("remaining")
    private int remaining;

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getDeckId() {
        return deckId;
    }

    public void setDeckId(String deckId) {
        this.deckId = deckId;
    }

    public boolean getShuffled() {
        return shuffled;
    }

    public void setShuffled(boolean shuffled) {
        this.shuffled = shuffled;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    @Override
    public String toString() {
        return "NewDeck{" +
                "success=" + success +
                ", deckId='" + deckId + '\'' +
                ", shuffled=" + shuffled +
                ", remaining=" + remaining +
                '}';
    }
}
