package utility;

import model.Blog;

interface OffensiveWordsInterface
{
	boolean checkBlogTitle(Blog blog) ;
	boolean checkBlogDescription(Blog blog);
}