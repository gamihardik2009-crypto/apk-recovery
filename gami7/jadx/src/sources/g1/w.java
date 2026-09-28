package g1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class w implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7767a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f7768b;

    public w(Spannable spannable) {
        this.f7768b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f7768b;
        if (!this.f7767a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C1.b(23, false) : new v(23, false)).m(spannable)) {
                this.f7768b = new SpannableString(spannable);
            }
        }
        this.f7767a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f7768b.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f7768b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f7768b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f7768b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f7768b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f7768b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f7768b.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f7768b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f7768b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f7768b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        a();
        this.f7768b.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f7768b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f7768b.toString();
    }
}
