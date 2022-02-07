/*
 * Copyright 2021 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.web3j.protocol.core.methods.response.walletLink;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RecordDataDeviceCreate {

    @JsonProperty("AllowanceType")
    private byte allowanceType;

    @JsonProperty("Lifetime")
    private String lifetimeAllowance;

    @JsonProperty("AmountPerDay")
    private String dailyAllowance; // Convert to BigInteger

    @JsonProperty("AmountPerMonth")
    private String monthlyAllowance;

    @JsonProperty("ExpirationTimeout")
    private String exprationTimeout; // Finality

    @JsonProperty("DeviceID")
    private int deviceID;

    @JsonProperty("NeedsConfirmation")
    private boolean needsConfirmation;

    @JsonProperty("PublicKey")
    private String publicKey; // PublicKeyHash // address from where you execute acceptDeviceData

    @JsonProperty("Label")
    private String label;

    @JsonProperty("Settings")
    private byte settings;
    // boolean CanModifyKeyPairs = true;
    // boolean CanIssueGenesis = true;
    // boolean CanCreateContract = true;
    // boolean CanIssueSelfProposition = true;

    /*
     *
     * "0xc3500", Settings: 15
     */

    public RecordDataDeviceCreate() {
        super();
    }

    public RecordDataDeviceCreate(
            byte allowanceType,
            String lifetimeAllowance,
            String dailyAllowance,
            String monthlyAllowance,
            String exprationTimeout,
            int deviceID,
            boolean needsConfirmation,
            String publicKey,
            String label,
            byte settings) {
        this.allowanceType = allowanceType;
        this.lifetimeAllowance = lifetimeAllowance;
        this.dailyAllowance = dailyAllowance;
        this.monthlyAllowance = monthlyAllowance;
        this.exprationTimeout = exprationTimeout;
        this.deviceID = deviceID;
        this.needsConfirmation = needsConfirmation;
        this.publicKey = publicKey;
        this.label = label;
        this.settings = settings;
    }

    @Override
    public String toString() {
        return "RecordDataDeviceCreate [allowanceType="
                + allowanceType
                + ", lifetimeAllowance="
                + lifetimeAllowance
                + ", dailyAllowance="
                + dailyAllowance
                + ", monthlyAllowance="
                + monthlyAllowance
                + ", exprationTimeout="
                + exprationTimeout
                + ", deviceID="
                + deviceID
                + ", needsConfirmation="
                + needsConfirmation
                + ", publicKey="
                + publicKey
                + ", label="
                + label
                + ", settings="
                + settings
                + "]";
    }

    public byte getAllowanceType() {
        return allowanceType;
    }

    public void setAllowanceType(byte allowanceType) {
        this.allowanceType = allowanceType;
    }

    public String getLifetimeAllowance() {
        return lifetimeAllowance;
    }

    public void setLifetimeAllowance(String lifetimeAllowance) {
        this.lifetimeAllowance = lifetimeAllowance;
    }

    public String getDailyAllowance() {
        return dailyAllowance;
    }

    public void setDailyAllowance(String dailyAllowance) {
        this.dailyAllowance = dailyAllowance;
    }

    public String getMonthlyAllowance() {
        return monthlyAllowance;
    }

    public void setMonthlyAllowance(String monthlyAllowance) {
        this.monthlyAllowance = monthlyAllowance;
    }

    public String getExprationTimeout() {
        return exprationTimeout;
    }

    public void setExprationTimeout(String exprationTimeout) {
        this.exprationTimeout = exprationTimeout;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public boolean isNeedsConfirmation() {
        return needsConfirmation;
    }

    public void setNeedsConfirmation(boolean needsConfirmation) {
        this.needsConfirmation = needsConfirmation;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public byte getSettings() {
        return settings;
    }

    public void setSettings(byte settings) {
        this.settings = settings;
    }
}
