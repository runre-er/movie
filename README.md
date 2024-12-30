# movie

The structure was prepared to work on and write examples for all types of queries, with a focus on ranking productions
similar to the IMDb system but in a customized table structure.

Table and relations :

## Database Schema

![image](https://github.com/user-attachments/assets/2a8015a0-1bb4-4178-848d-5b31126a168c)

### Core Entities

1. **Productions**
    - Central table in the system
    - Contains movie/series information (title, release date, duration)
    - Related to country, language, and genre information
    - Links to various crew members through relationship tables

2. **Persons**
    - Stores fundamental information about individuals
    - Connected to actors, directors, writers, and technical crew
    - Contains basic personal information (name, birth date, nationality)

### Entity Relationships

#### Production Team Relationships

- **actors**
    - Links persons to productions in acting roles
    - Many-to-many relationship
    - Includes role-specific information

- **directors**
    - Connects persons to productions in directing capacity
    - Multiple directors can be assigned to a production

- **writers**
    - Associates persons with productions for writing credits
    - Supports multiple writers per production

- **stars**
    - Identifies leading performers in productions
    - Distinguished from regular acting roles

- **tech_crews**
    - Links technical staff to specific jobs
    - Connected to both persons and job types

#### Production Details

- **productions → countries**
    - Each production is associated with one country
    - Represents the primary production country

- **productions → genres**
    - Single genre assignment per production
    - Defines primary classification

- **productions → languages**
    - Primary language designation
    - One language per production entry

- **productions → imdb_scores**
    - Rating and voting information
    - Includes score and vote count metrics

- **productions → revenues**
    - Financial performance tracking
    - Multiple revenue entries possible per production

#### User Interaction System

- **users → comments**
    - User-generated content management
    - Multiple comments per user allowed
    - Links to specific productions

### Key Constraints

1. **Referential Integrity**
    - All foreign key relationships must be maintained
    - Deletion rules should be carefully considered in testing

2. **Unique Constraints**
    - User nicknames must be unique
    - Production titles may have duplicates but should be handled appropriately

3. **Data Validation**
    - Release dates must be valid dates
    - Ratings must fall within specified ranges (0-10)
    - Vote counts must be positive integers

### Testing Considerations

1. **Relationship Testing**
    - Verify proper creation of related entities
    - Test cascading effects of updates/deletes
    - Ensure proper handling of many-to-many relationships

2. **Data Integrity**
    - Validate foreign key constraints
    - Test unique constraint enforcement
    - Verify proper handling of optional vs required fields

3. **Performance Testing**
    - Test with realistic data volumes
    - Verify relationship query performance
    - Check indexing effectiveness

# Movie System DTO Test Guide

## Overview

This guide provides comprehensive information about the DTO (Data Transfer Object) structure and testing procedures for
the Movie System project. The system includes DTOs for managing movies, people, comments, ratings, and various other
entities related to movie production and management.

## Project Structure

```
src/
  ├── main/
  │   ├── java/
  │   │   └── body/
  │   │       └── movieSystem/
  │   │           ├── dto/
  │   │                ├── general/           (DTO classes)
  │   │                        
  │   └── resources/
  │       └── test-data/                      (test data)
  └── test/       └── *examples.json          (test json)  
      └── java/
          └── body/
              └── movieSystem/
                  └── dto/
                      └── test/              
```

## DTO Validation Rules

### Common Rules

- All IDs (`@NonNullId`) must be positive values
- Date format must be: "YYYY-MM-DD"
- All fields marked with `@NotBlank` cannot be empty or null

### Specific DTO Rules

#### UserDTO

- Nick: 3-20 characters, must be unique
- Email: Must be valid email format
- Registration time: Automatically set by system

#### CommentDTO

- Message: 3-1000 characters
- Allowed characters: a-z, A-Z, 0-9, space, .,!?'
- Requires valid production_id and person_id

#### ImdbScoreDTO

- Score: Range 0-10
- VotesCount: Must be positive
- Requires valid productionId

#### ProductionDTO

- PlayTime: Must be positive (minutes)
- ReleaseDate: Must be in the past
- Requires valid country_id, genre_id, and language_id

#### PersonDTO

- BirthDate: Must be in the past
- BirthCountry: Cannot be empty

## Testing Guidelines

### Test Data Preparation

1. Use provided JSON examples in `/src/main/resources/test-data/`
2. Ensure all required fields are populated
3. Follow validation rules for each DTO

### Required Test Cases

#### Basic CRUD Operations

1. Create new entries (POST)
2. Retrieve entries (GET)
3. Update existing entries (PUT)
4. Delete entries (DELETE)

#### Validation Testing

1. Test all boundary conditions
2. Verify error handling
3. Check unique constraint violations
4. Validate relationship integrity

### Example Test Scenarios

#### UserDTO Testing

```json
{
  "valid": {
    "name": "John",
    "surName": "Doe",
    "nick": "johndoe",
    "email": "john.doe@example.com"
  },
  "invalid": {
    "name": "",
    // Should fail @NotBlank
    "nick": "jo"
    // Should fail length validation
  }
}
```

## Common HTTP Status Codes

- 200: Successful operation
- 201: Successfully created
- 400: Invalid input
- 404: Resource not found
- 409: Conflict (e.g., unique constraint violation)
- 500: Internal server error

## Best Practices

1. Always validate request payload against DTO rules
2. Test with both valid and invalid data
3. Check relationship integrity between DTOs
4. Verify error messages and status codes
5. Test edge cases and boundary values

## Common Issues and Solutions

### Issue 1: Invalid Date Format

```json
// Incorrect
"birthDate": "01-01-1990"

// Correct
"birthDate": "1990-01-01"
```

### Issue 2: ID Relationships

Ensure all referenced IDs exist in the system before creating relationships.

## API Testing Tools

- Recommended: Postman, JUnit, REST Assured
- Collections available in `/test/resources/postman/`

## Contact & Support

For additional support or questions:

- Create an issue in the project repository
- Contact the development team
- Reference the API documentation

## Changelog

- Initial release: Basic DTO structure and validation rules
- Future updates will be documented here