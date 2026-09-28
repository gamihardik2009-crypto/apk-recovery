package c1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f7285a;

    /* renamed from: b, reason: collision with root package name */
    public final C0615h f7286b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7287c;

    public C0608a(int i2, C0615h c0615h, int i3) {
        this.f7285a = i2;
        this.f7286b = c0615h;
        this.f7287c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f7285a);
        this.f7286b.f7299a.performAction(this.f7287c, bundle);
    }
}
