package io.arrogantprogrammer.developerscorner.knative.thoughts;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ThoughtsService {

    List<Thought> thoughts = new ArrayList<>(){{
        add(new Thought("I think, therefore I am", "René Descartes"));
        add(new Thought("A person who never made a mistake never tried anything new.", "Albert Einstein"));
        add(new Thought("There is no greater agony than bearing an untold story inside you.", "Maya Angelou"));
        add(new Thought("The only way to do great work is to love what you do.", "Steve Jobs"));
        add(new Thought("The only thing we have to fear is fear itself.", "Franklin D. Roosevelt"));
        add(new Thought("The only true wisdom is in knowing you know nothing.", "Socrates"));
        add(new Thought("The only thing necessary for the triumph of evil is for good men to do nothing.","John Stuart Mill"));
        add(new Thought("I have not failed. I’ve just found 10,000 ways that won’t work.", "Thomas Edison"));
        add(new Thought("In a gentle way, you can shake the world.","Mahatma Gandhi"));
        add(new Thought("The mind is everything. What you think you become.","Buddha"));
        add(new Thought("The best way to predict the future is to invent it.","Alan Kay"));
        add(new Thought("The best way to find yourself is to lose yourself in the service of others.","Mahatma Gandhi"));
        add(new Thought("You have within you right now, everything you need to deal with whatever the world can throw at you.", "Brian Tracy"));
        add(new Thought("There are no limits. There are only plateaus, and you must not stay there, you must go beyond them.", "Bruce Lee"));
        add(new Thought("The journey is the reward.", "Tao"));
        add(new Thought("No legacy is so rich as honesty.", "William Shakespeare"));
        add(new Thought("Believe you can and you’re halfway there.", "Teddy Roosevelt"));
        add(new Thought("It does not matter how slowly you go as long as you do not stop.", "Confuscius"));
        add(new Thought("The true sign of intelligence is not knowledge but imagination.", "Albert Einstein"));
        add(new Thought("We cannot become what we need to be by remaining what we are.", "Max DePree"));
        add(new Thought("If you want to make your dreams come true, the first thing you have to do is wake up.", "J.M. Power"));
        add(new Thought("I fear not the man who has practiced 10,000 kicks once, but I fear the man who has practiced one kick 10,000 times.", "Bruce Lee"));
        add(new Thought("The best way out is always through.", "Robert Frost"));
        add(new Thought("There is no substitute for hard work.", "Thomas Edison"));
        add(new Thought("Don’t let yesterday take up too much of today.", "Will Rogers"));
        add(new Thought("Life is tough, but it’s tougher when you’re stupid.", "John Wayne"));
        add(new Thought("I have nothing to offer but blood, toil, tears, and sweat.", "Winston Churchill"));
        add(new Thought("You don’t have to be great to start, but you have to start to be great.", "Zig Ziglar"));
        add(new Thought("I can accept failure, everyone fails at something. But I can’t accept not trying.", "Michael Jordan"));
        add(new Thought("I am not afraid of an army of lions led by a sheep; I am afraid of an army of sheep led by a lion.", "Alexander"));
        add(new Thought("I don’t want to be a product of my environment. I want my environment to be a product of me.", "Jack Nicholson"));
        add(new Thought("The unexamined life is not worth living.", "Socrates"));
        add(new Thought("The greatest wealth is to live content with little.", "Lao Tzu"));
        add(new Thought("The future depends on what you do today.", "Mahatma Gandhi"));
        add(new Thought("Change your thoughts and you change your world.", "Norman Vincent Peale"));
        add(new Thought("Success is not final, failure is not fatal: it is the courage to continue that counts.", "Winson Churchill"));
        add(new Thought("The greatest glory in living lies not in never falling, but in rising every time we fall.", "Nelson Mandela"));
        add(new Thought("We can’t solve problems by using the same kind of thinking we used when we created them.", "Albert Einstein"));
        add(new Thought("It always seems impossible until it’s done.”", "Nelson Mandela"));
    }};

    public Thought randomThought() {
        return thoughts.get((int) (Math.random() * thoughts.size()));
    }
}
