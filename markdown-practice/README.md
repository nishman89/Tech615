# Header 1
## Header 2

### Header 3

###### Header 6

*This is italics*

_also italics_

**This is bold**

__this is also bold__

__*Bold* but only partly italics__


# Quotes

> The release of GTAVI has been delayed by another 2 years
> > Completed it anyway, mate
> > > Hey Jay


# Lists

- Point 1
- Point 2
- Point 3

* This
* That 
* Other
  * Etc

1. One 
1. Two
1. Three
   1. Three point 1

# Using links

[link is here](https://www.google.com/) click here to go to a webpage

## Pictures

<!-- ![alt-text](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGbYrzdA06OwEDH1bpLnb-ny3I7set59cbF2A3R_cgrDOLE9ZPsaQA6tg&s=10)

![my-image](images/my-pic.jpg) -->

## Link to document headers

- [Header 1](#header-1)
  - [Header 2](#header-2)
    - [Header 3](#header-3)
          - [Header 6](#header-6)
- [Quotes](#quotes)
- [Lists](#lists)
- [Using links](#using-links)
  - [Pictures](#pictures)
  - [Link to document headers](#link-to-document-headers)
- [GitHub Flavoured Markdown](#github-flavoured-markdown)
- [Tasks Lists](#tasks-lists)
  - [Tables](#tables)
- [Mermaid](#mermaid)

# GitHub Flavoured Markdown

```csharp
public static void Main(){
    Console.WriteLine("Hello, Tech 615");
}
```

```java
public static void main(){
    System.out.Println("Hello, Tech 615");
}
```

```sql
SELECT * FROM Customers
```

# Tasks Lists

- [ ] This is a list item
- [x] This is a list item, too!

## Tables

Name | Street | Town
-----|--------|-----
Nish| Main St| Brum
Cathy| ABC St|Ottawa

# Mermaid

```mermaid
graph TD;
    A-->B;
    A-->C;
    B-->D;
    C-->D;
```

```mermaid
flowchart TD
    A[Product Backlog] --> B[Sprint Planning]
    B --> C[Sprint Backlog Created]
    C --> D[Sprint Starts]
    
    D --> E[Daily Scrum / Daily Standup]
    E --> F{Sprint Work<br/>in Progress}
    F -->|Continue| E
    F -->|Sprint Duration Ends| G[Sprint Review]
    
    G --> H[Sprint Retrospective]
    H --> I[Increment Delivered]
    I --> B
    
    subgraph Sprint["Sprint (1-4 weeks)"]
        D
        E
        F
    end

    style A fill:#e1f5fe
    style I fill:#c8e6c9
    style B fill:#fff9c4
    style G fill:#fff9c4
    style H fill:#fff9c4
```

```mermaid
pie title smartPhoneUsers
    "iPhone":60
    "Samsung":30
    "Google": 10
```