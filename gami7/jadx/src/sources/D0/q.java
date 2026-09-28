package D0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f980a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f981b;

    /* renamed from: c, reason: collision with root package name */
    public final int f982c;

    /* renamed from: d, reason: collision with root package name */
    public float f983d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f984e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f985f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f986g;

    public q(CharSequence charSequence, K0.e eVar, int i2) {
        this.f980a = charSequence;
        this.f981b = eVar;
        this.f982c = i2;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f986g) {
            TextDirectionHeuristic a3 = E.a(this.f982c);
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f980a;
            TextPaint textPaint = this.f981b;
            this.f985f = i2 >= 33 ? AbstractC0059c.b(charSequence, textPaint, a3) : AbstractC0060d.b(charSequence, textPaint, a3);
            this.f986g = true;
        }
        return this.f985f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (D0.y.e(r4, F0.e.class) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b() {
        /*
            r7 = this;
            float r0 = r7.f983d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r7.f983d
            goto L57
        Lb:
            android.text.BoringLayout$Metrics r0 = r7.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r7.f981b
            java.lang.CharSequence r4 = r7.f980a
            if (r2 >= 0) goto L2e
            r0 = 0
            int r2 = r4.length()
            float r0 = android.text.Layout.getDesiredWidth(r4, r0, r2, r3)
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            float r0 = (float) r5
        L2e:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L33
            goto L55
        L33:
            boolean r2 = r4 instanceof android.text.Spanned
            if (r2 == 0) goto L49
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.Class<F0.f> r2 = F0.f.class
            boolean r2 = D0.y.e(r4, r2)
            if (r2 != 0) goto L52
            java.lang.Class<F0.e> r2 = F0.e.class
            boolean r2 = D0.y.e(r4, r2)
            if (r2 != 0) goto L52
        L49:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L52
            goto L55
        L52:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L55:
            r7.f983d = r0
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.q.b():float");
    }
}
