package D0;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;

/* renamed from: D0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0058b f963a = new C0058b();

    /* JADX WARN: Type inference failed for: r0v2, types: [D0.a] */
    public final int[] a(D d3, RectF rectF, int i2, final y2.e eVar) {
        SegmentFinder h2;
        int[] rangeForRect;
        if (i2 == 1) {
            h2 = E0.b.f1016a.a(new K1.l(d3.f949f.getText(), 1, d3.j()));
        } else {
            B.t.l();
            h2 = B.t.h(B.t.g(d3.f949f.getText(), d3.f944a));
        }
        rangeForRect = d3.f949f.getRangeForRect(rectF, h2, new Layout.TextInclusionStrategy() { // from class: D0.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) y2.e.this.j(rectF2, rectF3)).booleanValue();
            }
        });
        return rangeForRect;
    }
}
