package b;

import B1.RunnableC0015e;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.U;
import m2.C0880v;

/* renamed from: b.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488l extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6998i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0489m f6999j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0488l(AbstractActivityC0489m abstractActivityC0489m, int i2) {
        super(0);
        this.f6998i = i2;
        this.f6999j = abstractActivityC0489m;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f6998i) {
            case 0:
                AbstractActivityC0489m abstractActivityC0489m = this.f6999j;
                return new U(abstractActivityC0489m.getApplication(), abstractActivityC0489m, abstractActivityC0489m.getIntent() != null ? abstractActivityC0489m.getIntent().getExtras() : null);
            case 1:
                this.f6999j.reportFullyDrawn();
                return C0880v.f8657a;
            case 2:
                AbstractActivityC0489m abstractActivityC0489m2 = this.f6999j;
                return new C0490n(abstractActivityC0489m2.f7006m, new C0488l(abstractActivityC0489m2, 1));
            default:
                AbstractActivityC0489m abstractActivityC0489m3 = this.f6999j;
                C0499w c0499w = new C0499w(new RunnableC0015e(8, abstractActivityC0489m3));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (z2.h.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0489m3.getClass();
                        abstractActivityC0489m3.f7001h.a(new C0482f(c0499w, abstractActivityC0489m3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new C1.z(abstractActivityC0489m3, 6, c0499w));
                    }
                }
                return c0499w;
        }
    }
}
