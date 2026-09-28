package E0;

import android.text.SegmentFinder;

/* loaded from: classes.dex */
public final class a extends SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f1015a;

    public a(e eVar) {
        this.f1015a = eVar;
    }

    public final int nextEndBoundary(int i2) {
        return this.f1015a.b(i2);
    }

    public final int nextStartBoundary(int i2) {
        return this.f1015a.c(i2);
    }

    public final int previousEndBoundary(int i2) {
        return this.f1015a.d(i2);
    }

    public final int previousStartBoundary(int i2) {
        return this.f1015a.a(i2);
    }
}
