# Symbolic Links Documentation

This repository contains examples and documentation for symbolic links.

## Creating Symbolic Links

### Linux/macOS
```bash
# Create symbolic link
ln -s target_file link_name

# Examples
ln -s ../code/python/app_001.py symlinks/python_link
ln -s ../docs/README.md symlinks/docs_link
ln -s ../config/settings.yaml symlinks/config_link
```

### Windows
```cmd
# Create symbolic link
mklink link_name target_file

# Examples
mklink symlinks\python_link ..\code\python\app_001.py
mklink symlinks\docs_link ..\docs\README.md
mklink symlinks\config_link ..\config\settings.yaml
```

## Test Cases

### Internal Links
- Link to Python files
- Link to documentation files
- Link to configuration files
- Link to binary files

### Cross-File-Type Links
- Code file linking to documentation
- Documentation linking to configuration
- Configuration linking to code

### Circular Links
- A -> B -> C -> A (circular reference)

## Validation Script

```python
import os

def validate_symlinks():
    symlink_dir = "symlinks"
    if os.path.exists(symlink_dir):
        for file in os.listdir(symlink_dir):
            filepath = os.path.join(symlink_dir, file)
            if os.path.islink(filepath):
                target = os.readlink(filepath)
                print(f"Symlink: {file} -> {target}")
                if os.path.exists(target):
                    print(f"  ✓ Target exists")
                else:
                    print(f"  ✗ Target missing")
```

## Expected Results
- Symlinks should be detected and documented
- Target files should be accessible
- No processing errors should occur
- Metadata should capture symlink information
