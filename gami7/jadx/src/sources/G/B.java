package G;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import c0.C0603v;

/* loaded from: classes.dex */
public final class B extends RippleDrawable {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1124h;

    /* renamed from: i, reason: collision with root package name */
    public C0603v f1125i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f1126j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1127k;

    public B(boolean z3) {
        super(ColorStateList.valueOf(-16777216), null, z3 ? new ColorDrawable(-1) : null);
        this.f1124h = z3;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f1124h) {
            this.f1127k = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f1127k = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f1127k;
    }
}
