import { PostsService } from './posts.service';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular-http';
  constructor(private postsService: PostsService){}
  posts:any[] = [];
  callPosts(){
    this.postsService.getPosts().subscribe(
      (data) =>{
        this.posts = data;
      },
      (err) =>{
        console.log("Error - ",err);
      }
    );
  }
}
