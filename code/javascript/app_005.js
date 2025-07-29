// JavaScript file 5
const fs = require('fs');
const path = require('path');

class DataProcessor5 {
    constructor() {
        this.data = {};
        this.processedCount = 0;
    }
    
    async processData(data) {
        const processed = [];
        for (const item of data) {
            if (this.validateItem(item)) {
                processed.push(this.transformItem(item));
                this.processedCount++;
            }
        }
        return processed;
    }
    
    validateItem(item) {
        return item.id && item.name && item.value !== undefined;
    }
    
    transformItem(item) {
        return {
            id: item.id,
            name: item.name.toUpperCase(),
            value: item.value * 2,
            processedAt: Date.now()
        };
    }
}

module.exports = DataProcessor5;
