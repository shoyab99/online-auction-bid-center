
Overview
The Online Auction Bidding Centre is a web-based platform that facilitates online auctions, allowing users to place bids on various items in real time. The system includes user authentication, auction management, bidding functionalities, and an admin panel to oversee auction activities.

Features
User Module
User registration and login
View active and upcoming auctions
Place bids on items
Track bid history and auction status
Auction Module
List new auctions with item details, starting price, and time limits
Automatic auction expiration and winner selection
Real-time bidding updates
Admin Module
Manage users and auctions
Monitor bidding activities
View logs and analytics
Technologies Used
Front-end: React, Angular (if applicable), HTML, CSS, JavaScript
Back-end: ASP.NET Core, Node.js (if applicable)
Database: MySQL (bid_center_myDb)
Server Management: SQL Server Management Studio (SSMS)
Version Control: GitHub
Database Schema
The database contains the following tables:

users: Stores user details
auction: Maintains auction listings
bids: Records user bids
admin_logs: Tracks admin activities
Installation and Setup
Clone the repository:

sh
Copy code
git clone https://github.com/your-repo/OnlineAuctionBiddingCentre.git
Navigate to the project directory:

sh
Copy code
cd OnlineAuctionBiddingCentre  
Set up the database using MySQL with the following credentials:

Host: 20.204.218.104
Database Name: bid_center_myDb
Username: bid-center-Auction-user
Password: hsjSuwG73sjn26
Install dependencies:

sh
Copy code
npm install  # If using Node.js  
OR

sh
Copy code
dotnet restore  # If using .NET Core  
Run the application:

sh
Copy code
npm start  # For React/Node.js  
OR

sh
Copy code
dotnet run  # For .NET Core  
Future Enhancements
AI-powered price predictions
Blockchain integration for secure transactions
Mobile application support
Contributors
Shoyab – Backend Developer
License
This project is licensed under the MIT License.











Search

Reason

ChatGPT can make mistakes. Check important info.
