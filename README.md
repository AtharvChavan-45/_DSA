# Learn-JAVA

# 🩺 Kidney CT Dataset – Data Pipeline & Interview Notes

## 1. Dataset Preparation Flow

The project prepares the kidney CT dataset before sending it to the deep learning model.

### Overall Pipeline

```text
                         KIDNEY CT DATASET
                                │
                                ↓
                         kidneyData.csv
                                │
                                ↓
                     Find all JPG images
                                │
                                ↓
                    Match image + label
                                │
                                ↓
                    Remove missing files
                                │
                                ↓
                       Split Dataset
                                │
              ┌─────────────────┼─────────────────┐
              ↓                 ↓                 ↓
          Training          Validation           Test
            56%                 24%               20%
              │                 │                 │
              └─────────────────┼─────────────────┘
                                ↓
                       Image Transformations
                                │
                    ┌───────────┼───────────┐
                    ↓           ↓           ↓
                 Resize      ToTensor    Normalize
                 224×224
                    │           │           │
                    └───────────┼───────────┘
                                ↓
                       PyTorch Dataset
                                │
                                ↓
                          DataLoader
                                │
                         Batch Size = 32
                                │
                                ↓
                       Deep Learning Model
                                │
                                ↓
                         Prediction


Q1. Why do you split the dataset?

To train the model on one portion, tune/validate it on another portion, and finally evaluate its performance on unseen test data.

Q2. Why use 56/24/20?

The code first reserves 20% for testing. From the remaining 80%, 30% is used for validation, resulting in approximately 56% training, 24% validation and 20% testing.

Q3. Why use stratify?

To maintain approximately the same proportion of Normal, Cyst, Tumor and Stone classes in each split.

Q4. Why resize images to 224×224?

To provide a consistent input size to the neural network and allow images to be processed together in batches.

Q5. Why normalize?

Normalization standardizes the input values, which helps stable model training and is important when using pretrained models with ImageNet preprocessing.

Q6. What is Dataset in PyTorch?

Dataset defines how individual samples and their labels are loaded from the data source.

Q7. What is DataLoader?

DataLoader takes the Dataset and provides the data to the model in batches, with options such as shuffling and parallel loading.

Q8. Difference between Dataset and DataLoader?

Dataset = how to get one sample.

DataLoader = how to efficiently provide many samples/batches to the model.

```