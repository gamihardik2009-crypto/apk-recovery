package D0;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class m implements CharacterIterator {

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f969h;

    /* renamed from: j, reason: collision with root package name */
    public final int f971j;

    /* renamed from: i, reason: collision with root package name */
    public final int f970i = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f972k = 0;

    public m(CharSequence charSequence, int i2) {
        this.f969h = charSequence;
        this.f971j = i2;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i2 = this.f972k;
        if (i2 == this.f971j) {
            return (char) 65535;
        }
        return this.f969h.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f972k = this.f970i;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.f970i;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f971j;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f972k;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i2 = this.f970i;
        int i3 = this.f971j;
        if (i2 == i3) {
            this.f972k = i3;
            return (char) 65535;
        }
        int i4 = i3 - 1;
        this.f972k = i4;
        return this.f969h.charAt(i4);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i2 = this.f972k + 1;
        this.f972k = i2;
        int i3 = this.f971j;
        if (i2 < i3) {
            return this.f969h.charAt(i2);
        }
        this.f972k = i3;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i2 = this.f972k;
        if (i2 <= this.f970i) {
            return (char) 65535;
        }
        int i3 = i2 - 1;
        this.f972k = i3;
        return this.f969h.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i2) {
        if (i2 > this.f971j || this.f970i > i2) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f972k = i2;
        return current();
    }
}
