package K1;

import D.S;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.text.BreakIterator;
import t0.C1236E;
import t0.q0;

/* loaded from: classes.dex */
public final class l implements E0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4555a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4556b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4557c;

    public /* synthetic */ l(Object obj, int i2, Object obj2) {
        this.f4555a = i2;
        this.f4556b = obj;
        this.f4557c = obj2;
    }

    @Override // E0.e
    public int a(int i2) {
        do {
            E0.f fVar = (E0.f) this.f4557c;
            fVar.a(i2);
            i2 = ((BreakIterator) fVar.f1024e).preceding(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f4556b).charAt(i2)));
        return i2;
    }

    @Override // E0.e
    public int b(int i2) {
        do {
            E0.f fVar = (E0.f) this.f4557c;
            fVar.a(i2);
            i2 = ((BreakIterator) fVar.f1024e).following(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f4556b).charAt(i2 - 1)));
        return i2;
    }

    @Override // E0.e
    public int c(int i2) {
        CharSequence charSequence;
        do {
            E0.f fVar = (E0.f) this.f4557c;
            fVar.a(i2);
            i2 = ((BreakIterator) fVar.f1024e).following(i2);
            if (i2 != -1) {
                charSequence = (CharSequence) this.f4556b;
                if (i2 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i2)));
        return i2;
    }

    @Override // E0.e
    public int d(int i2) {
        do {
            E0.f fVar = (E0.f) this.f4557c;
            fVar.a(i2);
            i2 = ((BreakIterator) fVar.f1024e).preceding(i2);
            if (i2 == -1 || i2 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f4556b).charAt(i2 - 1)));
        return i2;
    }

    public void e(C1236E c1236e, boolean z3) {
        S s3 = (S) this.f4557c;
        S s4 = (S) this.f4556b;
        if (z3) {
            s4.c(c1236e);
            s3.c(c1236e);
        } else {
            if (s4.e(c1236e)) {
                return;
            }
            s3.c(c1236e);
        }
    }

    public boolean f(C1236E c1236e, boolean z3) {
        boolean e3 = ((S) this.f4556b).e(c1236e);
        return z3 ? e3 : e3 || ((S) this.f4557c).e(c1236e);
    }

    public boolean g() {
        return !(((q0) ((S) this.f4557c).f764d).isEmpty() && ((q0) ((S) this.f4556b).f764d).isEmpty());
    }

    public String toString() {
        switch (this.f4555a) {
            case 2:
                return "Bounds{lower=" + ((W0.b) this.f4556b) + " upper=" + ((W0.b) this.f4557c) + "}";
            default:
                return super.toString();
        }
    }

    public l(r1.r rVar) {
        this.f4555a = 0;
        this.f4556b = rVar;
        this.f4557c = new b(rVar, 3);
    }

    public l(int i2) {
        this.f4555a = i2;
        switch (i2) {
            case 4:
                this.f4556b = new L.d(new Reference[16]);
                this.f4557c = new ReferenceQueue();
                break;
            default:
                this.f4556b = new S(3);
                this.f4557c = new S(3);
                break;
        }
    }
}
