package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface
{
	String a[]= {"vag","vagina","vajayjay","va-j-j","valium",
			"venus mound","veqtable","viagra","vibrator","violet wand",
			"virgin","vixen","vjayjay","vodka","vomit",
			"vorarephilia","voyeur","vulgar","wankjob","vulva",
			"w00se","wad","wang","wank","wanker"};

	@Override
	public boolean checkBlogTitle(Blog blog) 
	{
		String title=blog.getBlogTitle();
		for(int i=0;i<25;i++)
		{
			if(title.equalsIgnoreCase(a[i]))
			{
				System.out.println(a[i]);
				return true;
			}
		}
	
		return false;
	}

	@Override
	public boolean checkBlogDescription(Blog blog)
	{
		String description=blog.getBlogDescription();
		for(int i=0;i<25;i++)
			{
			if(description.equalsIgnoreCase(a[i]))
				return true;
		}
	     return false;
	}

	@Override
	
	public boolean checkBlog(Blog blog)
	{
		if((checkBlogTitle(blog))||(checkBlogDescription(blog)))
			return false;
		return true;
	}
	
}