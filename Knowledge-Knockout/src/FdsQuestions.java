public class FdsQuestions implements Questions {
    private String[][] questions;
    private String[][] answers;

    public FdsQuestions() {
        questions = new String[100][5];
        answers = new String[100][1];

        // Question 1
        questions[0][0] = "Which of the following represents the type of variable used to store categorical data?";
        questions[0][1] = "Nominal";
        questions[0][2] = "Numeric";
        questions[0][3] = "Ordinal";
        questions[0][4] = "Interval";
        answers[0][0] = "Nominal";

// Question 2
        questions[1][0] = "Which metric is used to measure the central tendency of a dataset?";
        questions[1][1] = "Mean";
        questions[1][2] = "Variance";
        questions[1][3] = "Standard deviation";
        questions[1][4] = "Range";
        answers[1][0] = "Mean";

// Question 3
        questions[2][0] = "Which of the following is used to reduce the dimensions of a dataset?";
        questions[2][1] = "PCA (Principal Component Analysis)";
        questions[2][2] = "Logistic regression";
        questions[2][3] = "Naive Bayes";
        questions[2][4] = "K-Means Clustering";
        answers[2][0] = "PCA (Principal Component Analysis)";

// Question 4
        questions[3][0] = "Which of the following distributions is symmetrical?";
        questions[3][1] = "Normal Distribution";
        questions[3][2] = "Poisson Distribution";
        questions[3][3] = "Exponential Distribution";
        questions[3][4] = "Binomial Distribution";
        answers[3][0] = "Normal Distribution";

// Question 5
        questions[4][0] = "Which method is used for finding relationships among variables in data science?";
        questions[4][1] = "Correlation";
        questions[4][2] = "Classification";
        questions[4][3] = "Sampling";
        questions[4][4] = "Normalization";
        answers[4][0] = "Correlation";

// Question 6
        questions[5][0] = "Which algorithm is best suited for supervised learning?";
        questions[5][1] = "Decision Trees";
        questions[5][2] = "K-Means Clustering";
        questions[5][3] = "DBSCAN";
        questions[5][4] = "PCA";
        answers[5][0] = "Decision Trees";

// Question 7
        questions[6][0] = "Which of the following methods is used for scaling features?";
        questions[6][1] = "Min-Max Scaling";
        questions[6][2] = "Normalization";
        questions[6][3] = "Z-Score";
        questions[6][4] = "All of the above";
        answers[6][0] = "All of the above";

// Question 8
        questions[7][0] = "Which of the following terms describes a decision boundary that separates different classes in machine learning?";
        questions[7][1] = "Hyperplane";
        questions[7][2] = "Centroid";
        questions[7][3] = "Kernel";
        questions[7][4] = "Distance Metric";
        answers[7][0] = "Hyperplane";

// Question 9
        questions[8][0] = "Which statistical test is used to measure the independence of two categorical variables?";
        questions[8][1] = "Chi-Square Test";
        questions[8][2] = "T-Test";
        questions[8][3] = "ANOVA";
        questions[8][4] = "Z-Test";
        answers[8][0] = "Chi-Square Test";

// Question 10
        questions[9][0] = "What is the main goal of K-Means Clustering?";
        questions[9][1] = "To partition data into K clusters";
        questions[9][2] = "To perform classification";
        questions[9][3] = "To minimize variance";
        questions[9][4] = "To maximize likelihood";
        answers[9][0] = "To partition data into K clusters";

// Question 11
        questions[10][0] = "Which of the following is a supervised learning algorithm?";
        questions[10][1] = "Linear Regression";
        questions[10][2] = "K-Means Clustering";
        questions[10][3] = "DBSCAN";
        questions[10][4] = "Apriori Algorithm";
        answers[10][0] = "Linear Regression";

// Question 12
        questions[11][0] = "Which measure is used to calculate the spread or dispersion of a dataset?";
        questions[11][1] = "Standard Deviation";
        questions[11][2] = "Mean";
        questions[11][3] = "Median";
        questions[11][4] = "Mode";
        answers[11][0] = "Standard Deviation";

// Question 13
        questions[12][0] = "Which method is used to split data into training and test sets?";
        questions[12][1] = "Cross-validation";
        questions[12][2] = "Stratification";
        questions[12][3] = "Resampling";
        questions[12][4] = "Normalization";
        answers[12][0] = "Cross-validation";

// Question 14
        questions[13][0] = "Which of the following is an unsupervised learning algorithm?";
        questions[13][1] = "K-Means Clustering";
        questions[13][2] = "Logistic Regression";
        questions[13][3] = "Decision Trees";
        questions[13][4] = "Linear Regression";
        answers[13][0] = "K-Means Clustering";

// Question 15
        questions[14][0] = "Which algorithm is commonly used for classification tasks?";
        questions[14][1] = "Support Vector Machine (SVM)";
        questions[14][2] = "K-Means Clustering";
        questions[14][3] = "Linear Regression";
        questions[14][4] = "Principal Component Analysis (PCA)";
        answers[14][0] = "Support Vector Machine (SVM)";

// Question 16
        questions[15][0] = "Which term refers to the accuracy of a predictive model?";
        questions[15][1] = "Precision";
        questions[15][2] = "Recall";
        questions[15][3] = "F1 Score";
        questions[15][4] = "All of the above";
        answers[15][0] = "All of the above";

// Question 17
        questions[16][0] = "Which of the following techniques is used to prevent overfitting in machine learning models?";
        questions[16][1] = "Cross-validation";
        questions[16][2] = "Normalization";
        questions[16][3] = "Feature scaling";
        questions[16][4] = "Resampling";
        answers[16][0] = "Cross-validation";

// Question 18
        questions[17][0] = "Which of the following methods is used to find the most important features in a dataset?";
        questions[17][1] = "Feature Selection";
        questions[17][2] = "Clustering";
        questions[17][3] = "Dimensionality Reduction";
        questions[17][4] = "Regression Analysis";
        answers[17][0] = "Feature Selection";

// Question 19
        questions[18][0] = "Which term refers to a line or curve that best represents a dataset?";
        questions[18][1] = "Regression Line";
        questions[18][2] = "Decision Boundary";
        questions[18][3] = "Centroid";
        questions[18][4] = "Kernel";
        answers[18][0] = "Regression Line";

// Question 20
        questions[19][0] = "Which statistical method is used to test a hypothesis about the population mean?";
        questions[19][1] = "T-Test";
        questions[19][2] = "ANOVA";
        questions[19][3] = "Chi-Square Test";
        questions[19][4] = "Z-Test";
        answers[19][0] = "T-Test";

// Question 21
        questions[20][0] = "Which measure is used to evaluate a classification model’s performance?";
        questions[20][1] = "Confusion Matrix";
        questions[20][2] = "Regression Line";
        questions[20][3] = "Standard Error";
        questions[20][4] = "Skewness";
        answers[20][0] = "Confusion Matrix";

// Question 22
        questions[21][0] = "Which data visualization technique is commonly used to compare categorical data?";
        questions[21][1] = "Bar Chart";
        questions[21][2] = "Line Chart";
        questions[21][3] = "Scatter Plot";
        questions[21][4] = "Histogram";
        answers[21][0] = "Bar Chart";

// Question 23
        questions[22][0] = "Which of the following is a key step in preprocessing data?";
        questions[22][1] = "Handling missing values";
        questions[22][2] = "Normalizing the data";
        questions[22][3] = "Splitting the dataset";
        questions[22][4] = "All of the above";
        answers[22][0] = "All of the above";

// Question 24
        questions[23][0] = "Which algorithm is used for clustering data points?";
        questions[23][1] = "K-Means Clustering";
        questions[23][2] = "Random Forest";
        questions[23][3] = "Decision Tree";
        questions[23][4] = "Linear Regression";
        answers[23][0] = "K-Means Clustering";

// Question 25
        questions[24][0] = "Which of the following is used to analyze variance among groups?";
        questions[24][1] = "ANOVA";
        questions[24][2] = "T-Test";
        questions[24][3] = "Chi-Square";
        questions[24][4] = "Z-Test";
        answers[24][0] = "ANOVA";

// Question 26
        questions[25][0] = "Which statistical method compares means between two groups?";
        questions[25][1] = "T-Test";
        questions[25][2] = "ANOVA";
        questions[25][3] = "Chi-Square Test";
        questions[25][4] = "P-Value Test";
        answers[25][0] = "T-Test";

// Question 27
        questions[26][0] = "Which term refers to the point in a dataset that appears most frequently?";
        questions[26][1] = "Mode";
        questions[26][2] = "Median";
        questions[26][3] = "Mean";
        questions[26][4] = "Standard deviation";
        answers[26][0] = "Mode";

// Question 28
        questions[27][0] = "Which algorithm is used to construct decision trees in machine learning?";
        questions[27][1] = "CART (Classification and Regression Trees)";
        questions[27][2] = "Random Forest";
        questions[27][3] = "SVM (Support Vector Machine)";
        questions[27][4] = "K-Means";
        answers[27][0] = "CART (Classification and Regression Trees)";

// Question 29
        questions[28][0] = "Which term describes the likelihood of an event occurring?";
        questions[28][1] = "Probability";
        questions[28][2] = "Prediction";
        questions[28][3] = "Estimation";
        questions[28][4] = "Hypothesis";
        answers[28][0] = "Probability";

// Question 30
        questions[29][0] = "Which data type consists of unordered categories?";
        questions[29][1] = "Nominal";
        questions[29][2] = "Ordinal";
        questions[29][3] = "Interval";
        questions[29][4] = "Ratio";
        answers[29][0] = "Nominal";

        // Question 31
        questions[30][0] = "Which algorithm is used for classification tasks in machine learning?";
        questions[30][1] = "Naive Bayes";
        questions[30][2] = "K-Means Clustering";
        questions[30][3] = "PCA";
        questions[30][4] = "DBSCAN";
        answers[30][0] = "Naive Bayes";

// Question 32
        questions[31][0] = "Which of the following is a distance metric used in clustering algorithms?";
        questions[31][1] = "Euclidean Distance";
        questions[31][2] = "Correlation Coefficient";
        questions[31][3] = "P-value";
        questions[31][4] = "Standard Deviation";
        answers[31][0] = "Euclidean Distance";

// Question 33
        questions[32][0] = "Which method is used to detect outliers in a dataset?";
        questions[32][1] = "Box Plot";
        questions[32][2] = "Linear Regression";
        questions[32][3] = "PCA";
        questions[32][4] = "Random Forest";
        answers[32][0] = "Box Plot";

// Question 34
        questions[33][0] = "Which term refers to splitting the data into subsets for testing and training?";
        questions[33][1] = "Cross-validation";
        questions[33][2] = "Normalization";
        questions[33][3] = "Standardization";
        questions[33][4] = "Stratification";
        answers[33][0] = "Cross-validation";

// Question 35
        questions[34][0] = "Which is an example of a continuous variable?";
        questions[34][1] = "Height";
        questions[34][2] = "Color";
        questions[34][3] = "Gender";
        questions[34][4] = "City";
        answers[34][0] = "Height";

// Question 36
        questions[35][0] = "Which model evaluation metric is used for regression tasks?";
        questions[35][1] = "Mean Absolute Error (MAE)";
        questions[35][2] = "Confusion Matrix";
        questions[35][3] = "Precision";
        questions[35][4] = "Recall";
        answers[35][0] = "Mean Absolute Error (MAE)";

// Question 37
        questions[36][0] = "Which method can be used to deal with multicollinearity in a dataset?";
        questions[36][1] = "Principal Component Analysis (PCA)";
        questions[36][2] = "Linear Regression";
        questions[36][3] = "Naive Bayes";
        questions[36][4] = "Logistic Regression";
        answers[36][0] = "Principal Component Analysis (PCA)";

// Question 38
        questions[37][0] = "Which technique is used for data reduction by summarizing a large dataset?";
        questions[37][1] = "Principal Component Analysis (PCA)";
        questions[37][2] = "Linear Regression";
        questions[37][3] = "Decision Trees";
        questions[37][4] = "Random Forest";
        answers[37][0] = "Principal Component Analysis (PCA)";

// Question 39
        questions[38][0] = "Which of the following is a type of supervised learning?";
        questions[38][1] = "Logistic Regression";
        questions[38][2] = "K-Means Clustering";
        questions[38][3] = "DBSCAN";
        questions[38][4] = "Hierarchical Clustering";
        answers[38][0] = "Logistic Regression";

// Question 40
        questions[39][0] = "Which method is used to measure the performance of a binary classification model?";
        questions[39][1] = "Accuracy";
        questions[39][2] = "Sum of Squared Errors (SSE)";
        questions[39][3] = "Mean Squared Error (MSE)";
        questions[39][4] = "Variance";
        answers[39][0] = "Accuracy";

// Question 41
        questions[40][0] = "Which of the following is a measure of dispersion in a dataset?";
        questions[40][1] = "Variance";
        questions[40][2] = "Mean";
        questions[40][3] = "Median";
        questions[40][4] = "Mode";
        answers[40][0] = "Variance";

// Question 42
        questions[41][0] = "Which of the following algorithms is used for regression tasks?";
        questions[41][1] = "Linear Regression";
        questions[41][2] = "K-Means Clustering";
        questions[41][3] = "Random Forest Classifier";
        questions[41][4] = "Logistic Regression";
        answers[41][0] = "Linear Regression";

// Question 43
        questions[42][0] = "Which evaluation metric is used to penalize larger errors in regression models?";
        questions[42][1] = "Mean Squared Error (MSE)";
        questions[42][2] = "Mean Absolute Error (MAE)";
        questions[42][3] = "Precision";
        questions[42][4] = "Recall";
        answers[42][0] = "Mean Squared Error (MSE)";

// Question 44
        questions[43][0] = "Which term describes the process of adjusting a machine learning model’s hyperparameters?";
        questions[43][1] = "Tuning";
        questions[43][2] = "Training";
        questions[43][3] = "Testing";
        questions[43][4] = "Validation";
        answers[43][0] = "Tuning";

// Question 45
        questions[44][0] = "Which algorithm is used for market basket analysis?";
        questions[44][1] = "Apriori Algorithm";
        questions[44][2] = "K-Means Clustering";
        questions[44][3] = "Decision Trees";
        questions[44][4] = "Logistic Regression";
        answers[44][0] = "Apriori Algorithm";

// Question 46
        questions[45][0] = "Which of the following methods is used to impute missing data in a dataset?";
        questions[45][1] = "Mean Imputation";
        questions[45][2] = "Removing the Row";
        questions[45][3] = "Zero Imputation";
        questions[45][4] = "One Hot Encoding";
        answers[45][0] = "Mean Imputation";

// Question 47
        questions[46][0] = "Which visualization is best suited for showing the distribution of a continuous variable?";
        questions[46][1] = "Histogram";
        questions[46][2] = "Bar Chart";
        questions[46][3] = "Pie Chart";
        questions[46][4] = "Box Plot";
        answers[46][0] = "Histogram";

// Question 48
        questions[47][0] = "Which type of data refers to categories with a meaningful order but no specific numerical difference between them?";
        questions[47][1] = "Ordinal Data";
        questions[47][2] = "Nominal Data";
        questions[47][3] = "Interval Data";
        questions[47][4] = "Ratio Data";
        answers[47][0] = "Ordinal Data";

// Question 49
        questions[48][0] = "Which of the following methods is used for feature selection?";
        questions[48][1] = "Forward Selection";
        questions[48][2] = "Backward Elimination";
        questions[48][3] = "Lasso Regression";
        questions[48][4] = "All of the above";
        answers[48][0] = "All of the above";

// Question 50
        questions[49][0] = "Which concept refers to how well a model performs on unseen data?";
        questions[49][1] = "Generalization";
        questions[49][2] = "Overfitting";
        questions[49][3] = "Underfitting";
        questions[49][4] = "Tuning";
        answers[49][0] = "Generalization";

// Question 51
        questions[50][0] = "Which method is used to assess the performance of a model during training?";
        questions[50][1] = "Cross-Validation";
        questions[50][2] = "Hyperparameter Tuning";
        questions[50][3] = "Normalization";
        questions[50][4] = "Imputation";
        answers[50][0] = "Cross-Validation";

// Question 52
        questions[51][0] = "Which algorithm is commonly used for dimensionality reduction?";
        questions[51][1] = "PCA (Principal Component Analysis)";
        questions[51][2] = "Naive Bayes";
        questions[51][3] = "K-Nearest Neighbors";
        questions[51][4] = "DBSCAN";
        answers[51][0] = "PCA (Principal Component Analysis)";

// Question 53
        questions[52][0] = "Which concept is associated with training a model too well on the training dataset?";
        questions[52][1] = "Overfitting";
        questions[52][2] = "Underfitting";
        questions[52][3] = "Generalization";
        questions[52][4] = "Tuning";
        answers[52][0] = "Overfitting";

// Question 54
        questions[53][0] = "Which of the following is a parametric statistical test?";
        questions[53][1] = "T-Test";
        questions[53][2] = "Chi-Square Test";
        questions[53][3] = "Mann-Whitney U Test";
        questions[53][4] = "Kruskal-Wallis Test";
        answers[53][0] = "T-Test";

        // Question 55
        questions[54][0] = "Which evaluation metric is used for measuring classification model performance?";
        questions[54][1] = "Confusion Matrix";
        questions[54][2] = "R-squared";
        questions[54][3] = "MAE (Mean Absolute Error)";
        questions[54][4] = "MSE (Mean Squared Error)";
        answers[54][0] = "Confusion Matrix";

// Question 56
        questions[55][0] = "Which algorithm is used for anomaly detection?";
        questions[55][1] = "Isolation Forest";
        questions[55][2] = "K-Means Clustering";
        questions[55][3] = "Naive Bayes";
        questions[55][4] = "Linear Regression";
        answers[55][0] = "Isolation Forest";

// Question 57
        questions[56][0] = "Which of the following is a method to prevent overfitting?";
        questions[56][1] = "Regularization";
        questions[56][2] = "Underfitting";
        questions[56][3] = "Increasing Model Complexity";
        questions[56][4] = "Removing Features";
        answers[56][0] = "Regularization";

// Question 58
        questions[57][0] = "Which type of plot is useful for identifying correlations between variables?";
        questions[57][1] = "Scatter Plot";
        questions[57][2] = "Bar Chart";
        questions[57][3] = "Histogram";
        questions[57][4] = "Pie Chart";
        answers[57][0] = "Scatter Plot";

// Question 59
        questions[58][0] = "Which machine learning algorithm uses multiple weak learners to form a strong learner?";
        questions[58][1] = "Boosting";
        questions[58][2] = "Bagging";
        questions[58][3] = "K-Means Clustering";
        questions[58][4] = "Linear Regression";
        answers[58][0] = "Boosting";

// Question 60
        questions[59][0] = "Which statistical measure is used to describe the spread of data around the mean?";
        questions[59][1] = "Standard Deviation";
        questions[59][2] = "Median";
        questions[59][3] = "Mode";
        questions[59][4] = "P-value";
        answers[59][0] = "Standard Deviation";

// Question 61
        questions[60][0] = "Which algorithm is commonly used for clustering data points?";
        questions[60][1] = "K-Means";
        questions[60][2] = "Logistic Regression";
        questions[60][3] = "Random Forest";
        questions[60][4] = "SVM (Support Vector Machine)";
        answers[60][0] = "K-Means";

// Question 62
        questions[61][0] = "Which method is used to handle imbalanced datasets?";
        questions[61][1] = "Oversampling";
        questions[61][2] = "Cross-validation";
        questions[61][3] = "Feature Selection";
        questions[61][4] = "Dimensionality Reduction";
        answers[61][0] = "Oversampling";

// Question 63
        questions[62][0] = "Which process evaluates the impact of a feature on a machine learning model?";
        questions[62][1] = "Feature Importance";
        questions[62][2] = "Cross-Validation";
        questions[62][3] = "Hyperparameter Tuning";
        questions[62][4] = "Feature Extraction";
        answers[62][0] = "Feature Importance";

// Question 64
        questions[63][0] = "Which of the following algorithms is used for both classification and regression?";
        questions[63][1] = "Random Forest";
        questions[63][2] = "Naive Bayes";
        questions[63][3] = "K-Means";
        questions[63][4] = "DBSCAN";
        answers[63][0] = "Random Forest";

// Question 65
        questions[64][0] = "Which of the following measures the linear relationship between two variables?";
        questions[64][1] = "Correlation Coefficient";
        questions[64][2] = "Variance";
        questions[64][3] = "Mean";
        questions[64][4] = "Standard Deviation";
        answers[64][0] = "Correlation Coefficient";

// Question 66
        questions[65][0] = "Which method is used for dimensionality reduction in high-dimensional data?";
        questions[65][1] = "PCA (Principal Component Analysis)";
        questions[65][2] = "K-Means Clustering";
        questions[65][3] = "Bagging";
        questions[65][4] = "Boosting";
        answers[65][0] = "PCA (Principal Component Analysis)";

// Question 67
        questions[66][0] = "Which term refers to the error made by a model in predicting continuous values?";
        questions[66][1] = "Residual";
        questions[66][2] = "Bias";
        questions[66][3] = "Variance";
        questions[66][4] = "P-value";
        answers[66][0] = "Residual";

// Question 68
        questions[67][0] = "Which evaluation metric is used in binary classification to balance precision and recall?";
        questions[67][1] = "F1 Score";
        questions[67][2] = "Accuracy";
        questions[67][3] = "Confusion Matrix";
        questions[67][4] = "AUC-ROC";
        answers[67][0] = "F1 Score";

// Question 69
        questions[68][0] = "Which of the following algorithms is based on ensemble learning?";
        questions[68][1] = "Bagging";
        questions[68][2] = "K-Means Clustering";
        questions[68][3] = "SVM (Support Vector Machine)";
        questions[68][4] = "Linear Regression";
        answers[68][0] = "Bagging";

// Question 70
        questions[69][0] = "Which of the following methods is used to prevent a model from learning noise in the data?";
        questions[69][1] = "Regularization";
        questions[69][2] = "Cross-validation";
        questions[69][3] = "Imputation";
        questions[69][4] = "Normalization";
        answers[69][0] = "Regularization";

// Question 71
        questions[70][0] = "Which term refers to the difference between the predicted value and the actual value?";
        questions[70][1] = "Error";
        questions[70][2] = "Residual";
        questions[70][3] = "Bias";
        questions[70][4] = "Variance";
        answers[70][0] = "Error";

// Question 72
        questions[71][0] = "Which statistical test is used to determine if two categorical variables are independent?";
        questions[71][1] = "Chi-Square Test";
        questions[71][2] = "T-Test";
        questions[71][3] = "Z-Test";
        questions[71][4] = "ANOVA";
        answers[71][0] = "Chi-Square Test";

// Question 73
        questions[72][0] = "Which machine learning algorithm uses a decision boundary to separate data into different classes?";
        questions[72][1] = "SVM (Support Vector Machine)";
        questions[72][2] = "Linear Regression";
        questions[72][3] = "K-Means";
        questions[72][4] = "Naive Bayes";
        answers[72][0] = "SVM (Support Vector Machine)";

// Question 74
        questions[73][0] = "Which algorithm is used for market basket analysis to find associations between items?";
        questions[73][1] = "Apriori Algorithm";
        questions[73][2] = "K-Means";
        questions[73][3] = "Random Forest";
        questions[73][4] = "Linear Regression";
        answers[73][0] = "Apriori Algorithm";

// Question 75
        questions[74][0] = "Which of the following is used to standardize features in a dataset?";
        questions[74][1] = "Z-Score Normalization";
        questions[74][2] = "Min-Max Scaling";
        questions[74][3] = "Mean Imputation";
        questions[74][4] = "PCA";
        answers[74][0] = "Z-Score Normalization";

// Question 76
        questions[75][0] = "Which type of machine learning model is used when the output is a continuous variable?";
        questions[75][1] = "Regression";
        questions[75][2] = "Classification";
        questions[75][3] = "Clustering";
        questions[75][4] = "Dimensionality Reduction";
        answers[75][0] = "Regression";

// Question 77
        questions[76][0] = "Which statistical measure indicates how much two variables change together?";
        questions[76][1] = "Covariance";
        questions[76][2] = "Mean";
        questions[76][3] = "Standard Deviation";
        questions[76][4] = "P-value";
        answers[76][0] = "Covariance";

// Question 78
        questions[77][0] = "Which of the following is used to evaluate a model’s ability to generalize to unseen data?";
        questions[77][1] = "Cross-Validation";
        questions[77][2] = "Imputation";
        questions[77][3] = "Feature Selection";
        questions[77][4] = "Normalization";
        answers[77][0] = "Cross-Validation";

        // Question 79
        questions[78][0] = "Which of the following is a technique for reducing overfitting in machine learning?";
        questions[78][1] = "Regularization";
        questions[78][2] = "Feature Selection";
        questions[78][3] = "Normalization";
        questions[78][4] = "Cross-Validation";
        answers[78][0] = "Regularization";

// Question 80
        questions[79][0] = "Which of the following is a type of unsupervised learning?";
        questions[79][1] = "Clustering";
        questions[79][2] = "Linear Regression";
        questions[79][3] = "Logistic Regression";
        questions[79][4] = "Decision Trees";
        answers[79][0] = "Clustering";

// Question 81
        questions[80][0] = "What is the purpose of feature scaling?";
        questions[80][1] = "To normalize the range of independent variables";
        questions[80][2] = "To reduce dimensionality";
        questions[80][3] = "To increase the dataset size";
        questions[80][4] = "To improve model interpretability";
        answers[80][0] = "To normalize the range of independent variables";

// Question 82
        questions[81][0] = "Which of the following is NOT a type of bias in machine learning?";
        questions[81][1] = "Selection Bias";
        questions[81][2] = "Measurement Bias";
        questions[81][3] = "Statistical Bias";
        questions[81][4] = "Algorithmic Bias";
        answers[81][0] = "Statistical Bias";

// Question 83
        questions[82][0] = "Which evaluation metric is best for imbalanced datasets?";
        questions[82][1] = "F1 Score";
        questions[82][2] = "Accuracy";
        questions[82][3] = "ROC-AUC";
        questions[82][4] = "Precision";
        answers[82][0] = "F1 Score";

// Question 84
        questions[83][0] = "Which method is used to fill missing values in a dataset?";
        questions[83][1] = "Imputation";
        questions[83][2] = "Normalization";
        questions[83][3] = "Regularization";
        questions[83][4] = "Transformation";
        answers[83][0] = "Imputation";

// Question 85
        questions[84][0] = "Which of the following techniques can be used to visualize high-dimensional data?";
        questions[84][1] = "t-SNE (t-Distributed Stochastic Neighbor Embedding)";
        questions[84][2] = "Linear Regression";
        questions[84][3] = "Logistic Regression";
        questions[84][4] = "K-Means Clustering";
        answers[84][0] = "t-SNE (t-Distributed Stochastic Neighbor Embedding)";

// Question 86
        questions[85][0] = "Which of the following is used for ensemble learning?";
        questions[85][1] = "Random Forest";
        questions[85][2] = "K-Means Clustering";
        questions[85][3] = "Linear Regression";
        questions[85][4] = "Naive Bayes";
        answers[85][0] = "Random Forest";

// Question 87
        questions[86][0] = "What is the purpose of a confusion matrix?";
        questions[86][1] = "To evaluate the performance of a classification model";
        questions[86][2] = "To visualize data distributions";
        questions[86][3] = "To summarize the distribution of a continuous variable";
        questions[86][4] = "To assess the linear relationship between variables";
        answers[86][0] = "To evaluate the performance of a classification model";

// Question 88
        questions[87][0] = "Which of the following is a measure of central tendency?";
        questions[87][1] = "Mean";
        questions[87][2] = "Standard Deviation";
        questions[87][3] = "Variance";
        questions[87][4] = "Range";
        answers[87][0] = "Mean";

// Question 89
        questions[88][0] = "What does 'bias-variance tradeoff' refer to in machine learning?";
        questions[88][1] = "The balance between error due to bias and error due to variance";
        questions[88][2] = "The tradeoff between precision and recall";
        questions[88][3] = "The balance between training and testing data";
        questions[88][4] = "The tradeoff between model complexity and interpretability";
        answers[88][0] = "The balance between error due to bias and error due to variance";

// Question 90
        questions[89][0] = "Which algorithm is used for time series forecasting?";
        questions[89][1] = "ARIMA (AutoRegressive Integrated Moving Average)";
        questions[89][2] = "K-Means Clustering";
        questions[89][3] = "Random Forest";
        questions[89][4] = "Support Vector Machine";
        answers[89][0] = "ARIMA (AutoRegressive Integrated Moving Average)";

// Question 91
        questions[90][0] = "Which term describes the process of converting raw data into a usable format?";
        questions[90][1] = "Data Preprocessing";
        questions[90][2] = "Data Mining";
        questions[90][3] = "Data Warehousing";
        questions[90][4] = "Data Visualization";
        answers[90][0] = "Data Preprocessing";

// Question 92
        questions[91][0] = "What does PCA stand for?";
        questions[91][1] = "Principal Component Analysis";
        questions[91][2] = "Primary Component Analysis";
        questions[91][3] = "Predictive Component Analysis";
        questions[91][4] = "Projected Component Analysis";
        answers[91][0] = "Principal Component Analysis";

// Question 93
        questions[92][0] = "Which of the following is an example of supervised learning?";
        questions[92][1] = "Linear Regression";
        questions[92][2] = "K-Means Clustering";
        questions[92][3] = "Principal Component Analysis";
        questions[92][4] = "Anomaly Detection";
        answers[92][0] = "Linear Regression";

// Question 94
        questions[93][0] = "Which algorithm is used for feature selection?";
        questions[93][1] = "Lasso Regression";
        questions[93][2] = "K-Means Clustering";
        questions[93][3] = "Linear Regression";
        questions[93][4] = "SVM (Support Vector Machine)";
        answers[93][0] = "Lasso Regression";

// Question 95
        questions[94][0] = "What is the main goal of exploratory data analysis (EDA)?";
        questions[94][1] = "To summarize main characteristics of the data";
        questions[94][2] = "To build predictive models";
        questions[94][3] = "To implement machine learning algorithms";
        questions[94][4] = "To validate the model performance";
        answers[94][0] = "To summarize main characteristics of the data";

// Question 96
        questions[95][0] = "Which method is commonly used to check for multicollinearity?";
        questions[95][1] = "Variance Inflation Factor (VIF)";
        questions[95][2] = "Confusion Matrix";
        questions[95][3] = "Chi-Square Test";
        questions[95][4] = "ANOVA";
        answers[95][0] = "Variance Inflation Factor (VIF)";

// Question 97
        questions[96][0] = "Which of the following techniques is used for data normalization?";
        questions[96][1] = "Min-Max Scaling";
        questions[96][2] = "Random Forest";
        questions[96][3] = "K-Means Clustering";
        questions[96][4] = "Logistic Regression";
        answers[96][0] = "Min-Max Scaling";

// Question 98
        questions[97][0] = "What does ROC stand for in ROC curve?";
        questions[97][1] = "Receiver Operating Characteristic";
        questions[97][2] = "Random Optimal Control";
        questions[97][3] = "Receiver Optimal Classification";
        questions[97][4] = "Random Operating Curve";
        answers[97][0] = "Receiver Operating Characteristic";

// Question 99
        questions[98][0] = "What is the purpose of using a validation set in machine learning?";
        questions[98][1] = "To tune hyperparameters and prevent overfitting";
        questions[98][2] = "To train the model";
        questions[98][3] = "To evaluate the model's accuracy";
        questions[98][4] = "To collect more data";
        answers[98][0] = "To tune hyperparameters and prevent overfitting";

// Question 100
        questions[99][0] = "Which of the following is a common technique for model evaluation?";
        questions[99][1] = "Cross-Validation";
        questions[99][2] = "Data Augmentation";
        questions[99][3] = "Normalization";
        questions[99][4] = "Feature Engineering";
        answers[99][0] = "Cross-Validation";



    }

    public String[][] getQuestions() {
        return questions;
    }

    public String[][] getAnswers() {
        return answers;
    }
}
