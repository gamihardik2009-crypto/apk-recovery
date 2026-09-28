package E0;

import B1.t;
import D.C0046o;
import D0.m;
import java.text.BreakIterator;
import java.util.Locale;
import n2.AbstractC0959k;
import t0.AbstractC1265x;
import z2.h;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1020a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f1021b;

    /* renamed from: c, reason: collision with root package name */
    public int f1022c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f1023d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1024e;

    public /* synthetic */ f() {
    }

    public void a(int i2) {
        int i3 = this.f1021b;
        int i4 = this.f1022c;
        if (i2 > i4 || i3 > i2) {
            StringBuilder sb = new StringBuilder("Invalid offset: ");
            sb.append(i2);
            sb.append(". Valid range is [");
            sb.append(i3);
            sb.append(" , ");
            throw new IllegalArgumentException(t.j(sb, i4, ']').toString());
        }
    }

    public int b() {
        C0046o c0046o = (C0046o) this.f1024e;
        if (c0046o == null) {
            return ((String) this.f1023d).length();
        }
        return (c0046o.f872b - c0046o.b()) + (((String) this.f1023d).length() - (this.f1022c - this.f1021b));
    }

    public boolean c(int i2) {
        return i2 <= this.f1022c && this.f1021b + 1 <= i2 && Character.isLetterOrDigit(Character.codePointBefore(this.f1023d, i2));
    }

    public boolean d(int i2) {
        int i3 = this.f1021b + 1;
        if (i2 > this.f1022c || i3 > i2) {
            return false;
        }
        return l0.c.F(Character.codePointBefore(this.f1023d, i2));
    }

    public boolean e(int i2) {
        return i2 < this.f1022c && this.f1021b <= i2 && Character.isLetterOrDigit(Character.codePointAt(this.f1023d, i2));
    }

    public boolean f(int i2) {
        if (i2 >= this.f1022c || this.f1021b > i2) {
            return false;
        }
        return l0.c.F(Character.codePointAt(this.f1023d, i2));
    }

    public void g(int i2, int i3, String str) {
        if (i2 > i3) {
            throw new IllegalArgumentException(AbstractC1265x.d(i2, i3, "start index must be less than or equal to end index: ", " > ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(t.h("start must be non-negative, but was ", i2).toString());
        }
        C0046o c0046o = (C0046o) this.f1024e;
        if (c0046o == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i2, 64);
            int min2 = Math.min(((String) this.f1023d).length() - i3, 64);
            String str2 = (String) this.f1023d;
            int i4 = i2 - min;
            h.d(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i4, i2, cArr, 0);
            String str3 = (String) this.f1023d;
            int i5 = max - min2;
            int i6 = min2 + i3;
            h.d(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i3, i6, cArr, i5);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            C0046o c0046o2 = new C0046o();
            c0046o2.f872b = max;
            c0046o2.f875e = cArr;
            c0046o2.f873c = length;
            c0046o2.f874d = i5;
            this.f1024e = c0046o2;
            this.f1021b = i4;
            this.f1022c = i6;
            return;
        }
        int i7 = this.f1021b;
        int i8 = i2 - i7;
        int i9 = i3 - i7;
        if (i8 < 0 || i9 > c0046o.f872b - c0046o.b()) {
            this.f1023d = toString();
            this.f1024e = null;
            this.f1021b = -1;
            this.f1022c = -1;
            g(i2, i3, str);
            return;
        }
        int length2 = str.length() - (i9 - i8);
        if (length2 > c0046o.b()) {
            int b3 = length2 - c0046o.b();
            int i10 = c0046o.f872b;
            do {
                i10 *= 2;
            } while (i10 - c0046o.f872b < b3);
            char[] cArr2 = new char[i10];
            AbstractC0959k.o((char[]) c0046o.f875e, cArr2, 0, 0, c0046o.f873c);
            int i11 = c0046o.f872b;
            int i12 = c0046o.f874d;
            int i13 = i11 - i12;
            int i14 = i10 - i13;
            AbstractC0959k.o((char[]) c0046o.f875e, cArr2, i14, i12, i13 + i12);
            c0046o.f875e = cArr2;
            c0046o.f872b = i10;
            c0046o.f874d = i14;
        }
        int i15 = c0046o.f873c;
        if (i8 < i15 && i9 <= i15) {
            int i16 = i15 - i9;
            char[] cArr3 = (char[]) c0046o.f875e;
            AbstractC0959k.o(cArr3, cArr3, c0046o.f874d - i16, i9, i15);
            c0046o.f873c = i8;
            c0046o.f874d -= i16;
        } else if (i8 >= i15 || i9 < i15) {
            int b4 = c0046o.b() + i8;
            int b5 = c0046o.b() + i9;
            int i17 = c0046o.f874d;
            char[] cArr4 = (char[]) c0046o.f875e;
            AbstractC0959k.o(cArr4, cArr4, c0046o.f873c, i17, b4);
            c0046o.f873c += b4 - i17;
            c0046o.f874d = b5;
        } else {
            c0046o.f874d = c0046o.b() + i9;
            c0046o.f873c = i8;
        }
        str.getChars(0, str.length(), (char[]) c0046o.f875e, c0046o.f873c);
        c0046o.f873c = str.length() + c0046o.f873c;
    }

    public String toString() {
        switch (this.f1020a) {
            case 1:
                C0046o c0046o = (C0046o) this.f1024e;
                if (c0046o == null) {
                    return (String) this.f1023d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f1023d, 0, this.f1021b);
                sb.append((char[]) c0046o.f875e, 0, c0046o.f873c);
                char[] cArr = (char[]) c0046o.f875e;
                int i2 = c0046o.f874d;
                sb.append(cArr, i2, c0046o.f872b - i2);
                String str = (String) this.f1023d;
                sb.append((CharSequence) str, this.f1022c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public f(CharSequence charSequence, int i2, Locale locale) {
        this.f1023d = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (i2 < 0 || i2 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f1024e = wordInstance;
        this.f1021b = Math.max(0, -50);
        this.f1022c = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new m(charSequence, i2));
    }
}
