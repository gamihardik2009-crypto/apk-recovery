package i0;

import android.graphics.PathMeasure;
import c0.C0592k;
import m2.C0880v;

/* renamed from: i0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0713f extends z2.i implements y2.a {

    /* renamed from: j, reason: collision with root package name */
    public static final C0713f f7881j = new C0713f(0, 0);

    /* renamed from: k, reason: collision with root package name */
    public static final C0713f f7882k = new C0713f(0, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7883i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0713f(int i2, int i3) {
        super(i2);
        this.f7883i = i3;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f7883i) {
            case 0:
                return new C0592k(new PathMeasure());
            default:
                return C0880v.f8657a;
        }
    }
}
